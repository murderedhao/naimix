import { createRoot } from 'react-dom/client'
import { Provider } from 'react-redux'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import './index.css'
import store from './redux/store.js'
import Compatibility from './routes/compability/Root.jsx'
import Mainslash from './routes/main/root.jsx'
import Workers from './routes/workers/Root.jsx'
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

createRoot(document.getElementById('root')).render(
	<Provider store={store}>
		{' '}
		<RouterProvider router={router} />
	</Provider>
)
