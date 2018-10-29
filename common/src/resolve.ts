
export type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);
