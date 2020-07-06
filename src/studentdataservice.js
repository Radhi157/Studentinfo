
import http from "./http-common";

class studentdataservice {
  getAll() {
    return http.get("/student");
  }

  get(id) {
    return http.get(`/student/${id}`);
  }


  findByname(name) {
    return http.get(`/student?name=${name}`);
  }
}

export default new  studentdataservice;