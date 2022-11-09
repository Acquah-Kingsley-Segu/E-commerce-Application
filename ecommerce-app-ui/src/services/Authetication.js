import axios from "axios";

const API_BASE_URL = "http://localhost:8000/api/v1";

class Authentication {
  createUser(user) {
    return axios.post(API_BASE_URL + "/create_account", user);
  }

  getUserByUsername(username) {
    return axios.get(API_BASE_URL + "/login/" + username);
  }
}

export default new Authentication();
