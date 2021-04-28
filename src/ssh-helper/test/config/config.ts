export async function TestConfiguration(local: boolean) {
    if (local) {
        return {
            host: "localhost",
            port: 22,
            username: "user",
            password: "pass",
        };
    } else {
        return {
            host: "104.207.199.181",
            port: 22,
            username: "vorfolomeev",
            keyFile: "H:/.ssh/sv01",
        };
    }
}