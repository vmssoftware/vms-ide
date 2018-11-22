import * as net from "net";
import * as optimist from "optimist";

const argv = optimist.argv;

const client = net.createConnection({ port: argv.port }, () => {
  let resp = "";
  client.write(argv.command);
  client.on("data", (data) => {
    resp += data.toString("utf8");
    if (resp === "Done") {
      client.end();
      console.log("Done");
      process.exit(0);
    } else if (resp === "Failed") {
      client.end();
      console.log("Failed");
      process.exit(1);
    }
  });
});

client.on("error", (err) => {
});
