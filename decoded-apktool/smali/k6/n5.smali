.class public final Lk6/n5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lk6/n5;->a:I

    iput-object p1, p0, Lk6/n5;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, Lk6/n5;->b:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-static {}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣۨ۟ۨ()I

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
    const-string v0, "9mFjO6AYV051jjCEm5eO8LSjolhvl"

    invoke-static {v0}, La/ۥۦۥۡ;->ۤۢ۠ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0}, Lh/۟ۡۥۡۧ;->۟ۥۣۢۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۦ۠۠ۧ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzcv;

    move-result-object v2

    invoke-static {p0}, Lt2/۟ۢ۟ۢ۟;->ۤۡ۟۠(Ljava/lang/Object;)Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    move-result-object v3

    packed-switch v1, :pswitch_data_0

    invoke-static {v3}, Le2/ۨۥۦۡ;->ۣۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

    invoke-static {v1}, Lx7/۟۟ۦۨۡ;->ۣۤ۠ۢ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v4

    invoke-static {v4}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۤۤ(Ljava/lang/Object;)V

    invoke-static {v3}, Le2/ۨۥۦۡ;->ۣۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    :sswitch_6
    invoke-static {v4, v2, v0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۨ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Z)V

    invoke-static {}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣۡۥۡ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-gtz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "jVikcEoPjYWK4fKji"

    invoke-static {v0}, Ln1/۟۠۟ۤۤ;->۟۟ۦ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :goto_3
    :sswitch_a
    return-void

    :pswitch_0
    invoke-static {v3}, Le2/ۨۥۦۡ;->ۣۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۣۢۢۦ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    new-instance v3, Ly2/a;

    invoke-static {v1, v0}, Lc1/ۢۥۥ۟;->ۣ۟۠ۨۡ(Ljava/lang/Object;Z)Lk6/x7;

    move-result-object v0

    sget v4, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۢۤۥۡ:I

    xor-int/lit16 v4, v4, -0x2a2

    invoke-direct {v3, v1, v0, v2, v4}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v3}, Lh6/ۧۧۤ۟;->۟ۦۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method
