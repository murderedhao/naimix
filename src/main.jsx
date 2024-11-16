import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./index.css";
import Main from "./routes/main/root.jsx";
import store from "./redux/store.js";
import { Provider } from "react-redux";
import Compatibility from "./routes/compability/Root.jsx";
import Workers from "./routes/workers/Root.jsx";
import { QueryClientProvider, QueryClient } from "@tanstack/react-query";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Main />,
  },
  {
    path: "/workers",
    element: <Workers />,
  },
  {
    path: "/compatibility",
    element: <Compatibility />,
  },
]);

const queryClient = new QueryClient();

createRoot(document.getElementById("root")).render(
  <Provider store={store}>
    <QueryClientProvider client={queryClient}>
      {" "}
      <RouterProvider router={router} />
    </QueryClientProvider>{" "}
  </Provider>
);
