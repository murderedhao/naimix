import close from '../../assets/isClose.png'

const Login = ({ isOpen, onClose }) => {
	if (!isOpen) return null

	return (
		<div className='fixed top-0 left-0 w-full h-full bg-black/50 flex justify-center items-center overflow-hidden transition-opacity duration-300 z-[99998]'>
			<div className='bg-white p-6 rounded-lg shadow-lg w-[400px] max-w-full'>
				{/* Кнопка закрытия */}
				<button
					onClick={onClose}
					className='absolute top-2 right-2 bg-white text-black p-2 rounded-full'
				>
					<img src={close} alt='Закрыть' className='w-6 h-6' />
				</button>

				{/* Заголовок */}
				<h1 className='text-2xl font-semibold text-center text-[#0c6565] mb-6'>
					Добавим сотрудника
				</h1>

				{/* Поля ввода */}
				<form className='space-y-4'>
					<div>
						<label className='block text-gray-700 mb-1'>ФИО</label>
						<input
							type='text'
							className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'
							placeholder='Введите полное имя'
						/>
					</div>
					<div>
						<label className='block text-gray-700 mb-1'>Почта</label>
						<input
							type='email'
							className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'
							placeholder='example@mail.com'
						/>
					</div>
					<div>
						<label className='block text-gray-700 mb-1'>Номер</label>
						<input
							type='tel'
							className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'
							placeholder='+7 (___) ___-__-__'
						/>
					</div>
					<div>
						<label className='block text-gray-700 mb-1'>Дата рождения</label>
						<input
							type='date'
							className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'
						/>
					</div>
					<div>
						<label className='block text-gray-700 mb-1'>Пол</label>
						<select className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'>
							<option value='male'>Мужской</option>
							<option value='female'>Женский</option>
						</select>
					</div>
					<div>
						<label className='block text-gray-700 mb-1'>Фото</label>
						<input
							type='file'
							className='w-full px-4 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-[#0c6565] focus:border-[#0c6565]'
						/>
					</div>
					{/* Кнопка */}
					<button
						type='submit'
						className='w-full py-2 mt-4 text-white bg-[#f15330] rounded-lg shadow-sm hover:bg-[#d9441e] transition'
					>
						Добавить
					</button>
				</form>
			</div>
		</div>
	)
}

export default Login
