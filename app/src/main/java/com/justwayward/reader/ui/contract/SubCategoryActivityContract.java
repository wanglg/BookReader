package com.justwayward.reader.ui.contract;

import com.justwayward.reader.base.BaseContract;
import com.justwayward.reader.base.BaseView;
import com.justwayward.reader.bean.CategoryListLv2;

/**
 * @author lfh.
 * @date 2016/8/30.
 */
public interface SubCategoryActivityContract {

    interface View extends BaseView {
        void showCategoryList(CategoryListLv2 data);

        void complete();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getCategoryListLv2();
    }

}
