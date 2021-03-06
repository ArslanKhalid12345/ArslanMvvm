package com.example.databinding.network;

import com.example.databinding.model.EmployeeDBResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeDataService {
  @GET("employees")
  Call<EmployeeDBResponse> getEmployees();
}
