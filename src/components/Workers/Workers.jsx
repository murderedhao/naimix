import { useState } from 'react'
import Addworker from '../Modal/Addworker'
const WorkersPage = () => {
	const [addActive, setAddActive] = useState(false)
	return (
		<>
			<div className='flex items-center justify-between ml-[175px] mr-[175px] mt-11'>
				<h1 className='text-2xl'>Ваш персонал</h1>
				<section>
					<button
						className='bg-[#0c6565] text-white px-4 py-2 rounded-full hover:bg-[#094949] transition'
						onClick={() => setAddActive(true)}
					>
						Добавить сотрудника
					</button>
					<Addworker isOpen={addActive} onClose={() => setAddActive(false)} />
				</section>
			</div>
			<div className='relative mt-[30px] mx-[150px] border'></div>
		</>
	)
}

export default WorkersPage
