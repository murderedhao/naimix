import { configureStore } from "@reduxjs/toolkit";
import counterReducer from "./slices/counterSlice";
import { usersApi } from "./todosApi";
export default configureStore({
  reducer: {
    counter: counterReducer,
  },
  middleware: (getDefaultMiddleware) =>
    getDefaultMiddleware().concat(usersApi.middleware),
});
