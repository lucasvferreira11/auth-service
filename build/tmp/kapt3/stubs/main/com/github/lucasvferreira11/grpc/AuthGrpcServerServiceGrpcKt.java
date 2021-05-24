package com.github.lucasvferreira11.grpc;

import java.lang.System;

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * com.github.lucasvferreira11.grpc.AuthGrpcServerService.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/github/lucasvferreira11/grpc/AuthGrpcServerServiceGrpcKt;", "", "()V", "sendMethod", "Lio/grpc/MethodDescriptor;", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerCredentials;", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerReply;", "getSendMethod", "()Lio/grpc/MethodDescriptor;", "serviceDescriptor", "Lio/grpc/ServiceDescriptor;", "getServiceDescriptor$annotations", "getServiceDescriptor", "()Lio/grpc/ServiceDescriptor;", "AuthGrpcServerServiceCoroutineImplBase", "AuthGrpcServerServiceCoroutineStub", "auth-service"})
public final class AuthGrpcServerServiceGrpcKt {
    @org.jetbrains.annotations.NotNull()
    public static final com.github.lucasvferreira11.grpc.AuthGrpcServerServiceGrpcKt INSTANCE = null;
    
    @java.lang.Deprecated()
    public static void getServiceDescriptor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.ServiceDescriptor getServiceDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials, com.github.lucasvferreira11.grpc.AuthGrpcServerReply> getSendMethod() {
        return null;
    }
    
    private AuthGrpcServerServiceGrpcKt() {
        super();
    }
    
    /**
     * A stub for issuing RPCs to a(n) com.github.lucasvferreira11.grpc.AuthGrpcServerService service
     * as suspending coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/github/lucasvferreira11/grpc/AuthGrpcServerServiceGrpcKt$AuthGrpcServerServiceCoroutineStub;", "Lio/grpc/kotlin/AbstractCoroutineStub;", "channel", "Lio/grpc/Channel;", "callOptions", "Lio/grpc/CallOptions;", "(Lio/grpc/Channel;Lio/grpc/CallOptions;)V", "build", "send", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerReply;", "request", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerCredentials;", "(Lcom/github/lucasvferreira11/grpc/AuthGrpcServerCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-service"})
    @io.grpc.kotlin.StubFor(value = com.github.lucasvferreira11.grpc.AuthGrpcServerServiceGrpc.class)
    public static final class AuthGrpcServerServiceCoroutineStub extends io.grpc.kotlin.AbstractCoroutineStub<com.github.lucasvferreira11.grpc.AuthGrpcServerServiceGrpcKt.AuthGrpcServerServiceCoroutineStub> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.github.lucasvferreira11.grpc.AuthGrpcServerServiceGrpcKt.AuthGrpcServerServiceCoroutineStub build(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            return null;
        }
        
        /**
         * Executes this RPC and returns the response message, suspending until the RPC completes
         * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
         * corresponding
         * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
         * with the corresponding exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return The single response from the server.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object send(@org.jetbrains.annotations.NotNull()
        com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials request, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.github.lucasvferreira11.grpc.AuthGrpcServerReply> p1) {
            return null;
        }
        
        public AuthGrpcServerServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            super(null, null);
        }
        
        public AuthGrpcServerServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel) {
            super(null, null);
        }
    }
    
    /**
     * Skeletal implementation of the com.github.lucasvferreira11.grpc.AuthGrpcServerService service
     * based on Kotlin coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/github/lucasvferreira11/grpc/AuthGrpcServerServiceGrpcKt$AuthGrpcServerServiceCoroutineImplBase;", "Lio/grpc/kotlin/AbstractCoroutineServerImpl;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "bindService", "Lio/grpc/ServerServiceDefinition;", "send", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerReply;", "request", "Lcom/github/lucasvferreira11/grpc/AuthGrpcServerCredentials;", "(Lcom/github/lucasvferreira11/grpc/AuthGrpcServerCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-service"})
    public static abstract class AuthGrpcServerServiceCoroutineImplBase extends io.grpc.kotlin.AbstractCoroutineServerImpl {
        
        /**
         * Returns the response to an RPC for
         * com.github.lucasvferreira11.grpc.AuthGrpcServerService.send.
         *
         * If this method fails with a [StatusException], the RPC will fail with the corresponding
         * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
         * the RPC will fail
         * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
         * fail with `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object send(@org.jetbrains.annotations.NotNull()
        com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.github.lucasvferreira11.grpc.AuthGrpcServerReply> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.grpc.ServerServiceDefinition bindService() {
            return null;
        }
        
        public AuthGrpcServerServiceCoroutineImplBase(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext coroutineContext) {
            super(null);
        }
        
        public AuthGrpcServerServiceCoroutineImplBase() {
            super(null);
        }
    }
}