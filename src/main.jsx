import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./index.css";
import Main from "./routes/main/root.jsx";
const router = createBrowserRouter([
  {
    path: "/",
    element: <Main />,
  },
]);

createRoot(document.getElementById("root")).render(
  <RouterProvider router={router} />
);
