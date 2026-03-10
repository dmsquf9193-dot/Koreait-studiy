import { create } from "zustand"

const DropdownStore = create((set) => ({
    selectOption: '',
    setSelectOption: (value) => set({selectOption: value})
}))

export default DropdownStore;