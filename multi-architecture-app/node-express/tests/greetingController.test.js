const request = require("supertest");
const createApp = require("../src/app");

describe("GET /hello", () => {
  it("returns Hello, World!", async () => {
    const app = createApp();

    const response = await request(app).get("/hello");

    expect(response.statusCode).toBe(200);
    expect(response.body).toEqual({ message: "Hello, World!" });
  });
});
