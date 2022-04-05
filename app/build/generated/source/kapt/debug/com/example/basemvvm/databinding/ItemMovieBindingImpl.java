package com.example.basemvvm.databinding;
import com.example.basemvvm.R;
import com.example.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMovieBindingImpl extends ItemMovieBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPoint.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.movie == variableId) {
            setMovie((com.example.basemvvm.data.model.movie.Result) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.example.basemvvm.data.model.movie.Result Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
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
        java.lang.String stringValueOfMovieVoteAverage = null;
        com.example.basemvvm.data.model.movie.Result movie = mMovie;
        java.lang.String javaLangStringHttpImageTmdbOrgTPW500MovieBackdropPath = null;
        java.lang.String movieOriginalTitle = null;
        java.lang.String movieBackdropPath = null;
        double movieVoteAverage = 0.0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movie != null) {
                    // read movie.originalTitle
                    movieOriginalTitle = movie.getOriginalTitle();
                    // read movie.backdropPath
                    movieBackdropPath = movie.getBackdropPath();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                }


                // read ("http://image.tmdb.org/t/p/w500") + (movie.backdropPath)
                javaLangStringHttpImageTmdbOrgTPW500MovieBackdropPath = ("http://image.tmdb.org/t/p/w500") + (movieBackdropPath);
                // read String.valueOf(movie.voteAverage)
                stringValueOfMovieVoteAverage = java.lang.String.valueOf(movieVoteAverage);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.basemvvm.ui.binding.BindingAdapters.loadImage(this.ivImage, javaLangStringHttpImageTmdbOrgTPW500MovieBackdropPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPoint, stringValueOfMovieVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, movieOriginalTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}