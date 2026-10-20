.class public final Ld5/e1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lm0/l3;

.field public final c:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/e1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x8dbs
        0x8d9s
        0x8d4s
        0x8d4s
        0x898s
        0x8ccs
        0x8d7s
        0x898s
        0x89fs
        0x8cas
        0x8dds
        0x8cbs
        0x8cds
        0x8d5s
        0x8dds
        0x89fs
        0x898s
        0x8das
        0x8dds
        0x8des
        0x8d7s
        0x8cas
        0x8dds
        0x898s
        0x89fs
        0x8d1s
        0x8d6s
        0x8ces
        0x8d7s
        0x8d3s
        0x8dds
        0x89fs
        0x898s
        0x8cfs
        0x8d1s
        0x8ccs
        0x8d0s
        0x898s
        0x8dbs
        0x8d7s
        0x8cas
        0x8d7s
        0x8cds
        0x8ccs
        0x8d1s
        0x8d6s
        0x8dds
    .end array-data
.end method

.method public constructor <init>(Lm0/l3;Lm0/g1;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Ld5/e1;->b:Lm0/l3;

    iput-object p2, p0, Ld5/e1;->c:Lm0/g1;

    sget v0, Ld3/ۡۨۢۦ;->ۣ۟ۡۧۤ:I

    xor-int/lit16 v0, v0, -0x396

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

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
    const-string v0, "tyLAVDKJUlSNOwSz1199zY"

    invoke-static {v0}, Lg/۟ۧ۠ۤ;->۟ۦۥۤۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۧ۠ۡۦ()[S
    .locals 2

    invoke-static {}, Lw5/ۢۤۢ۠;->ۣۢۧۨ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/e1;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e1\u06e6\u06e7"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object p0

    :sswitch_0
    invoke-static {p0}, Lg2/۟۠ۡۡۦ;->ۦۥۧ۠(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    const-string v1, "\u06e5\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lm5/ۣۢ۟ۧ;->ۣ۟ۡۡۤ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v1

    const-string v3, "\u06e3\u06e5\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    new-instance p0, Ld5/e1;

    invoke-direct {p0, v2, v0, p2}, Ld5/e1;-><init>(Lm0/l3;Lm0/g1;Lu8/e;)V

    const-string v1, "\u06df\u06e5\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaf62 -> :sswitch_1
        0x1ab6bd -> :sswitch_0
        0x1abdc7 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e1\u06e6\u06df"

    move-object v3, v0

    move-object v1, p1

    move-object v4, v0

    move-object v5, v0

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e1\u06e0\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v4}, Ld1/ۣۣ۟ۢۨ;->۟۠ۡۥۣ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e6\u06e4\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e1\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e6\u06e6"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v3, v5}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۡ۠ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e7\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Ld5/e1;

    const-string v6, "\u06e0\u06df\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_3
        0xdcc0 -> :sswitch_0
        0xdcdb -> :sswitch_4
        0x1aaac9 -> :sswitch_2
        0x1aaea9 -> :sswitch_1
        0x1ac1e7 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const-wide/16 v8, 0x6

    const/4 v6, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۣۧۢۢ(Ljava/lang/Object;)I

    move-result v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v2, v6, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

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
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Ld5/e1;->ۧ۠ۡۦ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۦۣۤۤ:I

    xor-int/lit16 v3, v3, 0xb6

    const/16 v4, 0x8b8

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->۠ۦ۠ۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {p0}, Lm5/ۣۢ۟ۧ;->ۣ۟ۡۡۤ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣۢۤۥ(Ljava/lang/Object;)J

    move-result-wide v2

    add-long/2addr v2, v8

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    sub-long/2addr v2, v4

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Lf4/ۦۣ۟ۦ;->۟ۡ۠ۦۧ(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0}, Lg2/۟۠ۡۡۦ;->ۦۥۧ۠(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v6, p0, Ld5/e1;->a:I

    const-wide/16 v2, 0x2cb

    sget v0, Lw5/ۣۨۧ۠;->۟۠ۢ۠۟:I

    int-to-long v4, v0

    xor-long/2addr v2, v4

    invoke-static {v2, v3, p0}, Lg0/۟ۥۢۥۢ;->ۣۣ۟۟ۧ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-ne v2, v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
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
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_9
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method
