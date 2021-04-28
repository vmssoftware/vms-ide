
export async function Delay(msec: number) {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve();
        }, msec);
    });
}
