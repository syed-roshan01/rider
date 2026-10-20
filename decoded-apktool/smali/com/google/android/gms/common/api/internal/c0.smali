.class public final Lcom/google/android/gms/common/api/internal/c0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/android/gms/common/api/internal/c0;->a:I

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/c0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/common/api/internal/c0;->a:I

    iget v1, p0, Lcom/google/android/gms/common/api/internal/c0;->b:I

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lg8/v0;

    iget-object v0, v2, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, v1}, Le8/k;->request(I)V

    return-void

    :pswitch_0
    check-cast v2, Lg8/k;

    iget-object v0, v2, Lg8/k;->b:Lg8/v3;

    invoke-interface {v0, v1}, Lg8/v3;->d(I)V

    return-void

    :pswitch_1
    move-object v0, v2

    check-cast v0, Ll/z2;

    iget-object v3, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v3, Lg8/x3;

    invoke-virtual {v3}, Lg8/x3;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    check-cast v2, Ll/z2;

    iget-object v2, v2, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Lg8/x3;

    invoke-virtual {v2, v1}, Lg8/x3;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v2, v0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Lg8/k;

    invoke-virtual {v2, v1}, Lg8/k;->b(Ljava/lang/Throwable;)V

    iget-object v0, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    invoke-virtual {v0}, Lg8/x3;->close()V

    :goto_0
    return-void

    :pswitch_2
    check-cast v2, Lcom/google/android/gms/common/api/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/d0;->h(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
