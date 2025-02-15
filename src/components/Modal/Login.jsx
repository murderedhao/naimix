import axios from 'axios'
import { useState } from 'react'
import close from '../../assets/isClose.png'
const Login = ({ onOpen, onClose }) => {
	const [email, setEmail] = useState('')
	const [password, setPassword] = useState('')
	const [errorMessage, setErrorMessage] = useState(null)
	if (!onOpen) return null
	const handleSubmit = async e => {
		e.preventDefault()

		try {
			const response = await axios.post(
				'https://jsonplaceholder.typicode.com/users',
				{
					email,
					password,
				}
			)

			if (response.data.token) {
				localStorage.setItem('token', response.data.token) // Сохраняем токен в локальном хранилище
				window.location.href = '/workers' // Переходим на защищенный маршрут
			}
		} catch (error) {
			console.error(error.response.data.message || error.message)
			setErrorMessage('Неверный логин или пароль')
		}
	}
	return (
		<div className='fixed top-0 left-0 w-full h-full bg-black/50 overflow-hidden overflow-y-auto transition-opacity duration-300 z-[99998]'>
			<div className='absolute top-0 left-0 w-full h-full flex justify-center items-center'>
				{/* Кнопка закрытия */}
				<button
					onClick={onClose}
					className='absolute top-2 right-2 bg-white text-black p-2 rounded-full'
				>
					<img src={close} alt='Закрыть' className='w-6 h-6' />
				</button>
				{/* Контент модального окна */}
				<form
					onSubmit={handleSubmit}
					className='bg-white p-4 rounded-lg shadow-lg w-80 h-auto flex justify-center items-center flex-col'
				>
					<h1 className='text-[#0c6565] text-center'>Вход</h1>
					<label className='pt-4'>Почта</label>
					<input
						value={email}
						onChange={e => setEmail(e.target.value)}
						placeholder='Email'
						className='mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565] transition duration-200'
						type='email'
					></input>
					<label className='pt-4'>Пароль</label>
					<input
						className='mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565] transition duration-200'
						type='password'
						value={password}
						onChange={e => setPassword(e.target.value)}
						placeholder='Пароль'
					></input>
					<button className='text-black p-2 text-sm font-normal uppercase border border-solid border-[#f15330] rounded-full leading-relaxed transition-colors ease-in-out duration-200 hover:bg-black hover:text-white hover:border-black mt-4'>
						{/* 1 */}
						Войти
					</button>
					{errorMessage && <p style={{ color: 'red' }}>{errorMessage}</p>}
				</form>
			</div>
		</div>
	)
}

export default Login
