import * as net from "net";

if (process.argv.length < 4) {
  console.log("Params required");
  process.exit(2);
}

const port = parseInt(process.argv[2], 10);

const client = net.createConnection({ port }, () => {
  let resp = "";
  const buff = Buffer.from(process.argv[3], "base64");
  client.write(buff);
  client.on("data", (data) => {
    resp += data.toString("utf8");
    client.end();
    console.log(resp);
    if (resp.startsWith("Done")) {
      process.exit(0);
    }
    process.exit(1);
  });
});

client.on("error", (err) => {
});
