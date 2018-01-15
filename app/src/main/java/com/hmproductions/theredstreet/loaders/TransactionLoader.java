package com.hmproductions.theredstreet.loaders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import dalalstreet.api.DalalActionServiceGrpc;
import dalalstreet.api.actions.GetTransactionsRequest;
import dalalstreet.api.actions.GetTransactionsResponse;

public class TransactionLoader extends AsyncTaskLoader<GetTransactionsResponse> {

    private DalalActionServiceGrpc.DalalActionServiceBlockingStub actionServiceBlockingStub;

    public TransactionLoader(@NonNull Context context, DalalActionServiceGrpc.DalalActionServiceBlockingStub actionServiceBlockingStub) {
        super(context);
        this.actionServiceBlockingStub = actionServiceBlockingStub;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public GetTransactionsResponse loadInBackground() {
        return actionServiceBlockingStub.getTransactions(GetTransactionsRequest
                .newBuilder()
                .setCount(0)
                .setLastTransactionId(0)
                .build());
    }
}