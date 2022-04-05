package com.example.basemvvm.databinding;
import com.example.basemvvm.R;
import com.example.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignupBindingImpl extends FragmentSignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clName, 1);
        sViewsWithIds.put(R.id.etName, 2);
        sViewsWithIds.put(R.id.ivUser, 3);
        sViewsWithIds.put(R.id.tvNameLabel, 4);
        sViewsWithIds.put(R.id.divider, 5);
        sViewsWithIds.put(R.id.clEmail, 6);
        sViewsWithIds.put(R.id.etEmail, 7);
        sViewsWithIds.put(R.id.ivEmail, 8);
        sViewsWithIds.put(R.id.tvEmailLabel, 9);
        sViewsWithIds.put(R.id.divider1, 10);
        sViewsWithIds.put(R.id.clPass, 11);
        sViewsWithIds.put(R.id.etPass, 12);
        sViewsWithIds.put(R.id.ivPass, 13);
        sViewsWithIds.put(R.id.tvPassLabel, 14);
        sViewsWithIds.put(R.id.divider2, 15);
        sViewsWithIds.put(R.id.btnSkip, 16);
        sViewsWithIds.put(R.id.btnSignup, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[15]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}