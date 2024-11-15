import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";

export const usersApi = createApi({
  reducerPath: "users",
  baseQuery: fetchBaseQuery({ baseUrl: "/api/users" }),
  endpoints: (builder) => ({
    getUsers: builder.query({
      query: () => "",
    }),
  }),
});

export const { useGetUsersQuery } = usersApi;
