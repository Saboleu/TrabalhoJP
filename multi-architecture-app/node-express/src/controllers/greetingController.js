const express = require("express");
const GreetingService = require("../services/greetingService");

function createGreetingRouter(service = new GreetingService()) {
  const router = express.Router();

  router.get("/hello", (req, res) => {
    const response = service.getGreeting();
    res.json(response);
  });

  return router;
}

module.exports = createGreetingRouter;
