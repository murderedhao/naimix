<<<<<<< HEAD
import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./index.css";
import Main from "./routes/main/root.jsx";
import store from "./redux/store.js";
import { Provider } from "react-redux";
import Compatibility from "./routes/compability/Root.jsx";
import Workers from "./routes/workers/Root.jsx";
import { QueryClientProvider, QueryClient } from "@tanstack/react-query";

=======
import { createRoot } from 'react-dom/client'
import { Provider } from 'react-redux'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import './index.css'
import store from './redux/store.js'
import Compatibility from './routes/compability/Root.jsx'
import Mainslash from './routes/main/root.jsx'
import Workers from './routes/workers/Root.jsx'
>>>>>>> 27f55c197cd8f8889af21d97b61751db61338505
const router = createBrowserRouter([
	{
		path: '/',
		element: <Mainslash />,
	},
	{
		path: '/workers',
		element: <Workers />,
	},
	{
		path: '/compatibility',
		element: <Compatibility />,
	},
])

<<<<<<< HEAD
const queryClient = new QueryClient();

createRoot(document.getElementById("root")).render(
  <Provider store={store}>
    <QueryClientProvider client={queryClient}>
      {" "}
      <RouterProvider router={router} />
    </QueryClientProvider>{" "}
  </Provider>
);
=======
createRoot(document.getElementById('root')).render(
	<Provider store={store}>
		{' '}
		<RouterProvider router={router} />
	</Provider>
)
>>>>>>> 27f55c197cd8f8889af21d97b61751db61338505
