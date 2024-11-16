import { QueryClient, QueryClientProvider } from '@tanstack/react-query'
import { createRoot } from 'react-dom/client'
import { Provider } from 'react-redux'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import Main from '../src/routes/main/root.jsx'
import './index.css'
import store from './redux/store.js'
import Compatibility from './routes/compability/Root.jsx'
import Workers from './routes/workers/Root.jsx'

const router = createBrowserRouter([
	{
		path: '/',
		element: <Main />,
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

const queryClient = new QueryClient()

createRoot(document.getElementById('root')).render(
	<Provider store={store}>
		<QueryClientProvider client={queryClient}>
			{' '}
			<RouterProvider router={router} />
		</QueryClientProvider>{' '}
	</Provider>
)
