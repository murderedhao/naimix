import close from '../../assets/isClose.png'

const Modal = ({ isOpen, isClose }) => {
	if (!isOpen) return null

	return (
		<div className='fixed top-0 left-0 w-full h-full bg-black/50 overflow-hidden overflow-y-auto transition-opacity duration-300'>
			<div className='absolute top-0 left-0 w-full h-full flex justify-center items-center'>
				{/* Кнопка закрытия */}
				<button
					onClick={isClose}
					className='absolute top-2 right-2 bg-white text-black p-2 rounded-full'
				>
					<img src={close} alt='Закрыть' className='w-6 h-6' />
				</button>
				{/* Контент модального окна */}
				<div className='bg-white p-4 rounded-lg shadow-lg w-80 h-auto flex justify-center items-center flex-col'>
					<h1 className='text-[#0c6565] text-center'>Регистрация</h1>
					<button>Компания</button>
				</div>
			</div>
		</div>
	)
}

export default Modal
