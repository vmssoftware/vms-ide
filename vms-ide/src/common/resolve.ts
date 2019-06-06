export type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);
export type Reject = ((reason?: any) => void);