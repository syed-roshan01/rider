.class public final Lf0/a0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lf0/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLf0/c2;Ly1/v;)V
    .locals 3

    iput-boolean p1, p0, Lf0/a0;->a:Z

    iput-boolean p2, p0, Lf0/a0;->b:Z

    iput-object p3, p0, Lf0/a0;->c:Lf0/c2;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۢ۠ۧۦ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "fDuAmpYCYysTQITNyb"

    invoke-static {v0}, Lr4/۟ۦۦ۠ۥ;->۟ۦ۟ۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    const/4 v7, 0x1

    check-cast p1, La2/e;

    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۧۡ۠ۥ(Ljava/lang/Object;)Z

    move-result v2

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
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lj2/۠ۤۨۤ;->ۣۦۢۧ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lf6/ۣۣۣۣ۟;->ۣۤۤۨ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۨ۠۟(Ljava/lang/Object;)Lg2/h0;

    move-result-object v3

    invoke-static {v2}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۡۨۦۥ(Ljava/lang/Object;)Lf0/v;

    move-result-object v4

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v3, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    const/4 v1, 0x2

    new-array v1, v1, [Lg2/i;

    const/4 v5, 0x0

    new-instance v6, Lg2/f;

    invoke-direct {v6}, Lg2/f;-><init>()V

    aput-object v6, v1, v5

    new-instance v5, Lg2/a;

    invoke-direct {v5, p1, v7}, Lg2/a;-><init>(La2/e;I)V

    aput-object v5, v1, v7

    invoke-static {v1}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v2}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۣۥۦۥ(Ljava/lang/Object;)Lg2/j;

    move-result-object v2

    invoke-static {v2, v1}, Ll3/ۥۣۤ۟;->۟ۧۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;)Lg2/a0;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۦۡۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v1}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۧۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :sswitch_b
    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbf39

    goto :goto_4

    :sswitch_d
    if-nez v0, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {p1}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Lg2/a0;

    invoke-static {v1, v1}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۢۤۧ(II)J

    move-result-wide v6

    sget v1, Lz7/۟ۢۧۡۥ;->ۧۡۦۧ:I

    xor-int/lit16 v1, v1, -0x217

    invoke-direct {v2, v0, v6, v7, v1}, Lg2/a0;-><init>(Ljava/lang/String;JI)V

    invoke-static {v4, v2}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۧۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_f
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    const v1, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    const v1, 0xc221

    goto :goto_5

    :sswitch_11
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v0

    :sswitch_12
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_11
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_12
    .end sparse-switch
.end method
