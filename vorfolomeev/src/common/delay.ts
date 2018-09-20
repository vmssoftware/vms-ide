
export async function Delay(msec: number) {
    return new Promise((resolve,reject) => {
        setTimeout(() => {
            resolve();
        }, msec);
    })
}

