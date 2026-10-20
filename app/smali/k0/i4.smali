.class public final Lk0/i4;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lr1/i1;

.field public final c:Lc9/e;

.field public final d:Ld9/s;

.field public final e:J

.field public final f:I

.field public final n:Lc9/f;

.field public final o:Ljava/util/List;

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lr1/i1;Lc9/e;Ld9/s;JILc9/f;Ljava/util/ArrayList;I)V
    .locals 3

    iput-object p1, p0, Lk0/i4;->a:Ljava/util/List;

    iput-object p2, p0, Lk0/i4;->b:Lr1/i1;

    iput-object p3, p0, Lk0/i4;->c:Lc9/e;

    iput-object p4, p0, Lk0/i4;->d:Ld9/s;

    iput-wide p5, p0, Lk0/i4;->e:J

    iput p7, p0, Lk0/i4;->f:I

    iput-object p8, p0, Lk0/i4;->n:Lc9/f;

    iput-object p9, p0, Lk0/i4;->o:Ljava/util/List;

    iput p10, p0, Lk0/i4;->p:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۤۤۦ()I

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
    const-string v0, "hggKijhaJCpLH"

    invoke-static {v0}, Lj9/۠۠ۨ;->ۡۥۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const/4 v2, 0x0

    check-cast p1, Lr1/w0;

    invoke-static {p0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۠۟ۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    move v1, v2

    :goto_0
    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_1
    if-ge v1, v4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static {v3, v1}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/x0;

    invoke-static {p0}, Lz/ۨۤۥۨ;->۠۟ۤۧ(Ljava/lang/Object;)Ld9/s;

    move-result-object v5

    invoke-static {v5}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v5

    mul-int/2addr v5, v1

    invoke-static {p1, v0, v5, v2}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    sget v0, Lh/ۥۦۡۧ;->ۤۢۨۨ:I

    xor-int/lit16 v0, v0, -0x8c

    add-int/2addr v0, v1

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_2

    :sswitch_4
    move v1, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, La3/۟ۢۨۢۥ;->۟ۧۧۦۤ()Lk0/l4;

    move-result-object v0

    invoke-static {p0}, Lr4/۟ۦۦ۠ۥ;->۟ۦ۠۠ۢ(Ljava/lang/Object;)Lc9/e;

    move-result-object v1

    invoke-static {p0}, Lk4/۟۠ۦ۟ۤ;->ۦۨۡۡ(Ljava/lang/Object;)Lr1/i1;

    move-result-object v9

    invoke-static {v9, v0, v1}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۧۤۤۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {p0}, Lw6/۟ۥۧۡۨ;->۟ۡ۟۟ۦ(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v10}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v11

    move v8, v2

    :goto_3
    invoke-static {p0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۡۥۡۥ(Ljava/lang/Object;)I

    move-result v12

    const/16 v3, 0x748

    :goto_4
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    if-ge v8, v11, :cond_1

    const v3, 0xbe60

    goto :goto_4

    :cond_1
    :sswitch_7
    const v3, 0xbe41

    goto :goto_4

    :sswitch_8
    invoke-static {v10, v8}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lr1/i0;

    const/16 v6, 0xb

    move v3, v2

    move v4, v2

    move v5, v2

    invoke-static/range {v0 .. v6}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v4

    invoke-static {v7, v4, v5}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v3

    add-int/lit8 v4, v12, -0xf

    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    sub-int/2addr v4, v5

    add-int/lit8 v4, v4, 0xf

    invoke-static {p1, v3, v2, v4}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    sget v3, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۠۠ۢ۟:I

    xor-int/lit8 v3, v3, -0x3a

    add-int/2addr v3, v8

    const v4, 0xbe7f

    :goto_5
    const v5, 0xbe90

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3

    goto :goto_5

    :sswitch_9
    move v8, v3

    goto :goto_3

    :sswitch_a
    const v4, 0xbe9e

    goto :goto_5

    :sswitch_b
    invoke-static {}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->ۣ۟۟ۧۤ()Lk0/l4;

    move-result-object v0

    invoke-static {p0}, Ld9/ۨۧۧۦ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Lc9/f;

    move-result-object v1

    invoke-static {p0}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۡ۟ۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lv/n0;

    sget v5, Lm7/ۡۢۦۢ;->ۣ۠۠۠:I

    xor-int/lit16 v5, v5, 0x2da

    invoke-direct {v4, v5, v1, v3}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lu0/b;

    const v3, -0x60ada7a0

    sget v5, Le9/ۧۧۡ;->۟۟ۤ۠۟:I

    xor-int/2addr v3, v5

    const/4 v5, 0x1

    invoke-direct {v1, v3, v4, v5}, Lu0/b;-><init>(ILd9/j;Z)V

    invoke-static {v9, v0, v1}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۧۤۤۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    move v1, v2

    :goto_6
    const v0, 0xbefb

    :goto_7
    const v5, 0xbf0c

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_4

    goto :goto_7

    :cond_2
    :sswitch_c
    const v0, 0xbf39

    goto :goto_7

    :sswitch_d
    if-ge v1, v4, :cond_2

    const v0, 0xc1e3

    goto :goto_7

    :sswitch_e
    invoke-static {v3, v1}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/i0;

    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->۟۟ۡۨ۟(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5, v12}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۣ۟ۦۢۧ(II)J

    move-result-wide v6

    invoke-static {v0, v6, v7}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v0

    invoke-static {p1, v0, v2, v2}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    sget v0, Lh8/۟ۨۧ;->ۨ۟ۧ:I

    xor-int/lit16 v0, v0, 0x103

    add-int/2addr v0, v1

    const v1, 0xc202

    :goto_8
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_8

    :sswitch_f
    const v1, 0xc221

    goto :goto_8

    :sswitch_10
    move v1, v0

    goto :goto_6

    :sswitch_11
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch
.end method
