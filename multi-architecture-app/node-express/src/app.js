const express = require("express");
const createGreetingRouter = require("./controllers/greetingController");

function createApp() {
  const app = express();

  app.get("/health", (req, res) => {
    res.json({ status: "ok" });
  });

  app.use("/", createGreetingRouter());

  return app;
}

module.exports = createApp;
