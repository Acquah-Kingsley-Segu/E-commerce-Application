import axios from "axios";

const API_BASE_URL = "http://localhost:8000/api/v1";

class MainCategory {
  createCategory(category) {
    return axios.post(API_BASE_URL + "/main_category", category);
  }
  getCategoryList() {
    return axios.get(API_BASE_URL + "/main_category");
  }
}

export default new MainCategory();
