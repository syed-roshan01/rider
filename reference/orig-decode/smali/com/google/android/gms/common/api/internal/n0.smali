.class public final Lcom/google/android/gms/common/api/internal/n0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/common/api/internal/n0;->a:I

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/common/api/internal/n0;->a:I

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/android/gms/common/api/internal/z;

    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/z;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/d0;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " disconnecting because it was signed out."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/d;->disconnect(Ljava/lang/String;)V

    return-void

    :pswitch_0
    check-cast v1, Lcom/google/android/gms/common/api/internal/d0;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/d0;->g()V

    return-void

    :pswitch_1
    check-cast v1, Lcom/google/android/gms/common/api/internal/o0;

    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    new-instance v1, Lz5/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lz5/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/f0;->a(Lz5/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
