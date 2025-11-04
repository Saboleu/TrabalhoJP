const GreetingRepository = require("../repositories/greetingRepository");
const GreetingResponse = require("../models/greetingResponse");

class GreetingService {
  constructor(repository = new GreetingRepository()) {
    this.repository = repository;
  }

  getGreeting() {
    const message = this.repository.getGreeting();
    return new GreetingResponse(message);
  }
}

module.exports = GreetingService;
