package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface ListDiffInterface<T>{
    public boolean  TheSameAs (T o);

    public boolean  equals(Object o);

}

//public interface BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{

  //  @Override
  //  public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
   //     return oldItem.theSameAs(newItem);
            //}
   // @Override
   // public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
   //    return false;
    //}
   // @Override
    //public Object areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
     //   return newItem;
   // }

//}
