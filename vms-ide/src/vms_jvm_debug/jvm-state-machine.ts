
export enum JvmState {
    anyState,
    initial,
    askAttach,
    paused,
    askSetBreak,
    askClearBreak,
    askRun,
    askThreads,
    askLocals,
    askStack,
    askStep,
    askStop,
    running,
    waitThreadPrompt,
};

export enum JvmAction {
    attach,
    setBreak,
    clearBreak,
    run,
    threads,
    locals,
    stack,
    step,
    stop,
};

export interface IJvmMove {
    from: JvmState;
    to: JvmState;
    reason: JvmAction | RegExp;
    emits?: string[];
}

const JvmMoves: IJvmMove[] = [
    {   from: JvmState.initial,
        to: JvmState.askAttach,
        reason: JvmAction.attach,
    },
    {   from: JvmState.askAttach,
        to: JvmState.initial,
        reason: /Unable to attach to target VM./,
    },
    {   from: JvmState.askAttach,
        to: JvmState.paused,
        reason: /main\[1\]/,
    },
    {   from: JvmState.anyState,
        to: JvmState.askSetBreak,
        reason: JvmAction.setBreak,
    },
    {   from: JvmState.paused,
        to: JvmState.askClearBreak,
        reason: JvmAction.clearBreak,
    },
    {   from: JvmState.paused,
        to: JvmState.askRun,
        reason: JvmAction.run,
    },
    {   from: JvmState.paused,
        to: JvmState.askThreads,
        reason: JvmAction.threads,
    },
    {   from: JvmState.paused,
        to: JvmState.askLocals,
        reason: JvmAction.locals,
    },
    {   from: JvmState.paused,
        to: JvmState.askStack,
        reason: JvmAction.stack,
    },
    {   from: JvmState.paused,
        to: JvmState.askStep,
        reason: JvmAction.step,
    },
    {   from: JvmState.paused,
        to: JvmState.askStop,
        reason: JvmAction.stop,
    },
    {   from: JvmState.askSetBreak,
        to: JvmState.askStop,
        reason: JvmAction.stop,
    },
];

export class JvmStateMachine {



}