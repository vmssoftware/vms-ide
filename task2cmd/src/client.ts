import * as net from "net";
import * as optimist from "optimist";

const argv = optimist.argv;

const client = net.createConnection({ port: argv.port }, () => {
  client.end(argv.command);
});

client.on("error" , (err) => {
});
