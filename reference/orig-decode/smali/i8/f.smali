.class public final Li8/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedExceptionAction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li8/f;->a:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Method;
    .locals 3

    iget v0, p0, Li8/f;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-array v0, v1, [Ljava/lang/Class;

    const-class v1, Ljavax/net/ssl/SSLSocket;

    const-string v2, "getApplicationProtocol"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v2, [Ljava/lang/String;

    aput-object v2, v0, v1

    const-class v1, Ljavax/net/ssl/SSLParameters;

    const-string v2, "setApplicationProtocols"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-array v0, v1, [Ljava/lang/Class;

    const-class v1, Ljavax/net/ssl/SSLEngine;

    const-string v2, "getApplicationProtocol"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic run()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li8/f;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Li8/f;->a()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Li8/f;->a()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Li8/f;->a()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
