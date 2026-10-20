.class public final Lf0/b0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lf0/c2;

.field public final d:Lg2/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/b0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x1acs
        0x1e4s
        0x1f8s
        0x1f9s
        0x1e3s
        0x1aes
        0x762s
        0x775s
        0x760s
        0x77cs
        0x771s
        0x773s
        0x775s
        0x77ds
        0x775s
        0x77es
        0x764s
        0x1d2s
        0x1f9s
        0x1f3s
        0x1b7s
        0x1fes
        0x1f9s
        0x1f3s
        0x1f2s
        0x1efs
        0x1b7s
        0x1bfs
        0x25bs
        0x252s
        0x21bs
        0x201s
        0x252s
        0x21es
        0x217s
        0x201s
        0x201s
        0x252s
        0x206s
        0x21as
        0x213s
        0x21cs
        0x252s
        0x201s
        0x206s
        0x213s
        0x200s
        0x206s
        0x252s
        0x21bs
        0x21cs
        0x216s
        0x217s
        0x20as
        0x252s
        0x25as
        0xb16s
        0xb11s
    .end array-data
.end method

.method public constructor <init>(ZZLf0/c2;Ly1/v;Lg2/a0;)V
    .locals 2

    iput-boolean p1, p0, Lf0/b0;->a:Z

    iput-boolean p2, p0, Lf0/b0;->b:Z

    iput-object p3, p0, Lf0/b0;->c:Lf0/c2;

    iput-object p5, p0, Lf0/b0;->d:Lg2/a0;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

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
    const-string v0, "3YPMeKERC8eyjukkPG"

    invoke-static {v0}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۨۡۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۢۢۧ()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf0/b0;->short:[S

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    const/4 v6, 0x1

    const/4 v10, 0x0

    check-cast p1, La2/e;

    invoke-static {p0}, Li4/ۨ۟ۨ;->ۣۣ۟ۤۥ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lp8/۟۟ۢ۟ۢ;->ۣ۟ۧۦ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۧۡۦ۠(Ljava/lang/Object;)Lf0/c2;

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

    new-instance v5, Lg2/l;

    invoke-direct {v5}, Lg2/l;-><init>()V

    aput-object v5, v1, v10

    new-instance v5, Lg2/a;

    invoke-direct {v5, p1, v6}, Lg2/a;-><init>(La2/e;I)V

    aput-object v5, v1, v6

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
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->۠۠ۤ۟(Ljava/lang/Object;)Lg2/a0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v1

    invoke-static {v1}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۥ۠۠ۤ()I

    invoke-static {v0}, Lh6/ۧۧۤ۟;->ۣ۟ۡ۠۠(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x20

    shr-long v6, v2, v0

    long-to-int v5, v6

    const-wide v6, 0xffffffffL

    const-wide/16 v8, -0x1

    xor-long/2addr v6, v8

    xor-long/2addr v6, v2

    and-long/2addr v2, v6

    long-to-int v2, v2

    invoke-static {}, Lf0/b0;->۟ۢۢۧ()[S

    move-result-object v0

    sget v3, Lm3/۟ۦۦۡۢ;->۟۟۟ۡۢ:I

    xor-int/lit16 v3, v3, -0x275

    const/16 v6, 0x190

    invoke-static {v0, v10, v3, v6}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lf0/b0;->۟ۢۢۧ()[S

    move-result-object v0

    const/4 v3, 0x6

    sget v6, Landroidx/core/app/ۣۥۢۧ;->ۣ۟ۡ۠ۨ:I

    xor-int/lit8 v6, v6, -0x5c

    const/16 v7, 0x710

    invoke-static {v0, v3, v6, v7}, Le7/ۧ۠ۧ;->ۣ۠ۡۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-lt v2, v5, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v1, v10, v5}, Lx0/ۣ۠۟۠;->ۣۣۧ۠(Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/StringBuilder;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۦۥۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lx0/ۣ۠۟۠;->ۣۣۧ۠(Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    sub-int v1, v5, v1

    new-instance v2, Lg2/a0;

    invoke-static {v1, v1}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۢۤۧ(II)J

    move-result-wide v6

    sget v1, Lr5/۟ۤۨۥۡ;->۠ۦۦۦ:I

    xor-int/lit8 v1, v1, 0x6

    invoke-direct {v2, v0, v6, v7, v1}, Lg2/a0;-><init>(Ljava/lang/String;JI)V

    invoke-static {v4, v2}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۧۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_12
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    const v1, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_13
    const v1, 0xc5a4

    goto :goto_7

    :sswitch_14
    const v0, 0xc29d

    goto :goto_6

    :sswitch_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/b0;->۟ۢۢۧ()[S

    move-result-object v1

    const/16 v3, 0x11

    sget v4, Landroidx/core/app/ۣۥۢۧ;->ۣ۟ۡ۠ۨ:I

    xor-int/lit8 v4, v4, -0x5c

    const/16 v6, 0x197

    invoke-static {v1, v3, v4, v6}, Ld8/ۣۡۡ۠;->ۣۢۡۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/b0;->۟ۢۢۧ()[S

    move-result-object v1

    const/16 v2, 0x1c

    sget v3, Li5/ۢۤۡ;->ۤۧۡۦ:I

    xor-int/lit16 v3, v3, 0xb3

    const/16 v4, 0x272

    invoke-static {v1, v2, v3, v4}, Ld1/۟۟ۥۡۡ;->۟ۥۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v5}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/b0;->۟ۢۢۧ()[S

    move-result-object v1

    const/16 v2, 0x38

    sget v3, Lc0/ۦ۠۟ۥ;->ۣۨۤ۠:I

    xor-int/lit16 v3, v3, -0x350

    const/16 v4, 0xb3f

    invoke-static {v1, v2, v3, v4}, La8/ۡۦۨۡ;->ۧۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_16
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v0

    :sswitch_17
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_16
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
        0xb97b -> :sswitch_16
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
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_17
    .end sparse-switch
.end method
