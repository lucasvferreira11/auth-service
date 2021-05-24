package com.github.lucasvferreira11.grpc

import com.github.lucasvferreira11.grpc.AuthGrpcServerServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * com.github.lucasvferreira11.grpc.AuthGrpcServerService.
 */
object AuthGrpcServerServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AuthGrpcServerServiceGrpc.getServiceDescriptor()

  val sendMethod: MethodDescriptor<AuthGrpcServerCredentials, AuthGrpcServerReply>
    @JvmStatic
    get() = AuthGrpcServerServiceGrpc.getSendMethod()

  /**
   * A stub for issuing RPCs to a(n) com.github.lucasvferreira11.grpc.AuthGrpcServerService service
   * as suspending coroutines.
   */
  @StubFor(AuthGrpcServerServiceGrpc::class)
  class AuthGrpcServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AuthGrpcServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AuthGrpcServerServiceCoroutineStub = AuthGrpcServerServiceCoroutineStub(channel,
        callOptions)

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
    suspend fun send(request: AuthGrpcServerCredentials): AuthGrpcServerReply = unaryRpc(
      channel,
      AuthGrpcServerServiceGrpc.getSendMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.github.lucasvferreira11.grpc.AuthGrpcServerService service
   * based on Kotlin coroutines.
   */
  abstract class AuthGrpcServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
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
    open suspend fun send(request: AuthGrpcServerCredentials): AuthGrpcServerReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.github.lucasvferreira11.grpc.AuthGrpcServerService.send is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthGrpcServerServiceGrpc.getSendMethod(),
      implementation = ::send
    )).build()
  }
}
