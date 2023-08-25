
export async function Delay(msec: number) {
    return new Promise<void>((resolve) => {
        setTimeout(() => {
            resolve();
        }, msec);
    });
}
