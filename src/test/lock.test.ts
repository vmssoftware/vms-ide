import * as assert from "assert";

import { Lock, Delay, LockQueue, LockQueueAction } from "../common/main";
import { TaskCount } from "../common/task-count";

suite("Lock tests", function(this: Mocha.Suite) {

    this.timeout(0);

    return;

    this.beforeAll(async () => {
        // prepare
    });

    test("Simple lock test", async () => {
        const taskCount = new TaskCount();
        const lock = new Lock();

        const tasks: boolean[] = [
            false,  //0
            false,  //1
            false,  //2
            true,   //3
            false,  //4
            false,  //5
            true,   //6
            true,   //7
            true,   //8
            false,  //9
            true,   //10
        ];

        const tasksDelays: number[] = [
            0,
            0,
            0,
            0,
            500,
            0,
            0,
            0,
            0,
            0,
            0,
        ];

        const tasksTime: number[] = [
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
        ];

        for (let i = 0; i < tasks.length; ++i) {
            taskCount.taskStarted();
            lock.acquire(tasks[i]).then(async (isOk) => {
                console.log(`Task #${i} is ${isOk?"acquired":"cancelled"}`);
                if (isOk) {
                    if (tasksTime[i]) {
                        await Delay(tasksTime[i]);
                    }
                    lock.release();
                    console.log(`Task #${i} is released`);
                } else {
                    console.log(`Task #${i} isn't processed and not need to be released`);
                }
                taskCount.taskEnded();
            });
            if (tasksDelays[i]) {
                await Delay(tasksDelays[i]);
            }
        }

        await taskCount.waitAllTask();
        console.log(`All tasks are ended`);
        assert.equal(lock.isLocked, false, "Must be unlocked");
        assert.equal(taskCount.getCount(), 0, "All tasks must be ended");
    });

    test("Lock quque test", async () => {

        const taskCount = new TaskCount();
        const lock = new LockQueue();

        const tasks: LockQueueAction[] = [
            LockQueueAction.normal,  //0
            LockQueueAction.normal,  //1
            LockQueueAction.normal,  //2
            LockQueueAction.dropAll, //3
            LockQueueAction.normal,  //4
            LockQueueAction.normal,  //5
            LockQueueAction.toTheTop,//6
            LockQueueAction.normal,  //7
            LockQueueAction.normal,  //8
            LockQueueAction.toTheTop,//9
            LockQueueAction.dropAll, //10
        ];

        const tasksDelays: number[] = [
            0,
            0,
            0,
            0,
            500,
            0,
            0,
            0,
            0,
            0,
            0,
        ];

        const tasksTime: number[] = [
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
        ];

        for (let i = 0; i < tasks.length; ++i) {
            taskCount.taskStarted();
            lock.acquire(tasks[i]).then(async (isOk) => {
                console.log(`Task #${i} is ${isOk?"acquired":"cancelled"}`);
                if (isOk) {
                    if (tasksTime[i]) {
                        await Delay(tasksTime[i]);
                    }
                    lock.release();
                    console.log(`Task #${i} is released`);
                } else {
                    console.log(`Task #${i} isn't processed and not need to be released`);
                }
                taskCount.taskEnded();
            });
            if (tasksDelays[i]) {
                await Delay(tasksDelays[i]);
            }
        }

        await taskCount.waitAllTask();
        console.log(`All tasks are ended`);
        assert.equal(lock.isLocked, false, "Must be unlocked");
        assert.equal(taskCount.getCount(), 0, "All tasks must be ended");
    });

});
