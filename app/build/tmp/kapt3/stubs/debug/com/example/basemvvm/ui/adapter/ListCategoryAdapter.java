package com.example.basemvvm.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/basemvvm/ui/adapter/ListCategoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/basemvvm/data/model/Category;", "Lcom/example/basemvvm/ui/adapter/ListCategoryAdapter$CategoryViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CategoryViewHolder", "app_debug"})
public final class ListCategoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.basemvvm.data.model.Category, com.example.basemvvm.ui.adapter.ListCategoryAdapter.CategoryViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.basemvvm.ui.adapter.ListCategoryAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.adapter.ListCategoryAdapter.CategoryViewHolder holder, int position) {
    }
    
    public ListCategoryAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/basemvvm/ui/adapter/ListCategoryAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/basemvvm/databinding/ItemCategoryBinding;", "(Lcom/example/basemvvm/databinding/ItemCategoryBinding;)V", "getBinding", "()Lcom/example/basemvvm/databinding/ItemCategoryBinding;", "bind", "", "item", "Lcom/example/basemvvm/data/model/Category;", "Companion", "app_debug"})
    public static final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.basemvvm.databinding.ItemCategoryBinding binding = null;
        public static final com.example.basemvvm.ui.adapter.ListCategoryAdapter.CategoryViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.basemvvm.data.model.Category item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.basemvvm.databinding.ItemCategoryBinding getBinding() {
            return null;
        }
        
        private CategoryViewHolder(com.example.basemvvm.databinding.ItemCategoryBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/basemvvm/ui/adapter/ListCategoryAdapter$CategoryViewHolder$Companion;", "", "()V", "from", "Lcom/example/basemvvm/ui/adapter/ListCategoryAdapter$CategoryViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.basemvvm.ui.adapter.ListCategoryAdapter.CategoryViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}