.class public final Ld5/i2;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;I)V
    .locals 2

    iput p3, p0, Ld5/i2;->a:I

    iput-object p1, p0, Ld5/i2;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/i2;->c:Lm0/g1;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "IVIGHQRoryU1EVwRf"

    invoke-static {v0}, Lh8/۟ۨۧ;->۟ۨۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    const/4 v5, 0x0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lg/۟ۧ۠ۤ;->ۣۡ۟۟(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v2

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۨۦۤۡ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v3

    invoke-static {p0}, La7/۠ۢۧ;->ۥ۟ۢ(Ljava/lang/Object;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    invoke-static {v2}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۥۦۨ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v4, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lr9/۟ۢۢۤۨ;->ۨۤۥۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-object v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :pswitch_0
    invoke-static {v2}, Ln8/ۢۡۨۨ;->ۣۢ۠ۢ(Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v3, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    packed-switch v4, :pswitch_data_2

    invoke-static {v2}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۥۦۨ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v4, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lr9/۟ۢۢۤۨ;->ۨۤۥۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    const/16 v1, 0x6eb

    goto :goto_2

    :pswitch_2
    invoke-static {v2}, Ln8/ۢۡۨۨ;->ۣۢ۠ۢ(Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v3, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method
