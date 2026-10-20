.class public final Lf0/f2;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/s;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lg2/s;

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd3

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/f2;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3a9s
        0x380s
        0x380s
        0x395s
        0x383s
        0x392s
        0x3abs
        0x387s
        0x396s
        0x396s
        0x38fs
        0x388s
        0x381s
        0x3c8s
        0x392s
        0x394s
        0x387s
        0x388s
        0x395s
        0x380s
        0x389s
        0x394s
        0x38bs
        0x383s
        0x382s
        0x3b2s
        0x389s
        0x3a9s
        0x394s
        0x38fs
        0x381s
        0x38fs
        0x388s
        0x387s
        0x38as
        0x3c6s
        0x394s
        0x383s
        0x392s
        0x393s
        0x394s
        0x388s
        0x383s
        0x382s
        0x3c6s
        0x38fs
        0x388s
        0x390s
        0x387s
        0x38as
        0x38fs
        0x382s
        0x3c6s
        0x38bs
        0x387s
        0x396s
        0x396s
        0x38fs
        0x388s
        0x381s
        0x3dcs
        0x3c6s
        0x8bfs
        0x8b2s
        0x8a1s
        0x8bfs
        0xb50s
        0xb19s
        0xb03s
        0xb50s
        0xb1es
        0xb1fs
        0xb04s
        0xb50s
        0xb19s
        0xb1es
        0xb50s
        0xb02s
        0xb11s
        0xb1es
        0xb17s
        0xb15s
        0xb50s
        0xb1fs
        0xb16s
        0xb50s
        0xb1fs
        0xb02s
        0xb19s
        0xb17s
        0xb19s
        0xb1es
        0xb11s
        0xb1cs
        0xb50s
        0xb04s
        0xb15s
        0xb08s
        0xb04s
        0xb50s
        0xb2bs
        0xb40s
        0xb5cs
        0xb50s
        0x7c2s
        0x7ebs
        0x7ebs
        0x7fes
        0x7e8s
        0x7f9s
        0x7c0s
        0x7ecs
        0x7fds
        0x7fds
        0x7e4s
        0x7e3s
        0x7eas
        0x7a3s
        0x7e2s
        0x7ffs
        0x7e4s
        0x7eas
        0x7e4s
        0x7e3s
        0x7ecs
        0x7e1s
        0x7d9s
        0x7e2s
        0x7d9s
        0x7ffs
        0x7ecs
        0x7e3s
        0x7fes
        0x7ebs
        0x7e2s
        0x7ffs
        0x7e0s
        0x7e8s
        0x7e9s
        0x7ads
        0x7ffs
        0x7e8s
        0x7f9s
        0x7f8s
        0x7ffs
        0x7e3s
        0x7e8s
        0x7e9s
        0x7ads
        0x7e4s
        0x7e3s
        0x7fbs
        0x7ecs
        0x7e1s
        0x7e4s
        0x7e9s
        0x7ads
        0x7e0s
        0x7ecs
        0x7fds
        0x7fds
        0x7e4s
        0x7e3s
        0x7eas
        0x7b7s
        0x7ads
        0x81es
        0x813s
        0x800s
        0x81es
        0x246s
        0x20fs
        0x215s
        0x246s
        0x208s
        0x209s
        0x212s
        0x246s
        0x20fs
        0x208s
        0x246s
        0x214s
        0x207s
        0x208s
        0x201s
        0x203s
        0x246s
        0x209s
        0x200s
        0x246s
        0x212s
        0x214s
        0x207s
        0x208s
        0x215s
        0x200s
        0x209s
        0x214s
        0x20bs
        0x203s
        0x202s
        0x246s
        0x212s
        0x203s
        0x21es
        0x212s
        0x246s
        0x23ds
        0x256s
        0x24as
        0x246s
    .end array-data
.end method

.method public constructor <init>(Lg2/s;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/f2;->a:Lg2/s;

    iput p2, p0, Lf0/f2;->b:I

    iput p3, p0, Lf0/f2;->c:I

    invoke-static {}, Ld2/۟ۦۡ۟ۦ;->ۣۧۡۧ()I

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
    const-string v0, "X84"

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۣۣ۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۣۤۨۥ()[S
    .locals 2

    invoke-static {}, Lh/ۢۢۨۨ;->ۡۦ۟ۡ()I

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
    sget-object v0, Lf0/f2;->short:[S

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
.method public final a(I)I
    .locals 7

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->۟ۥۤۡۢ(Ljava/lang/Object;)Lg2/s;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۣۨ۠ۤ(Ljava/lang/Object;I)I

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
    if-ltz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۥۣۤۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gt p1, v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, La8/ۣۡۨ۠;->۟ۢۥۦۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-gt v1, v2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    return v1

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Ld1/ۣۣ۟ۢۨ;->۟ۦۢ۠ۧ:I

    xor-int/lit8 v5, v5, -0x31

    const/16 v6, 0x3e6

    invoke-static {v3, v4, v5, v6}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟۠۠۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v3

    const/16 v4, 0x3e

    sget v5, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۥۣۧ۟:I

    xor-int/lit16 v5, v5, -0x2e6

    const/16 v6, 0x89f

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۣۣۣۣ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v1

    const/16 v3, 0x42

    sget v4, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/lit16 v4, v4, 0x3fe

    const/16 v5, 0xb70

    invoke-static {v1, v3, v4, v5}, Ld9/ۧۧۨۥ;->ۣۤۨۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/IllegalStateException;

    const/16 v3, 0x5d

    invoke-static {v0, v2, v3}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۥۦۥۨ(Ljava/lang/Object;IC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method

.method public final b(I)I
    .locals 7

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->۟ۥۤۡۢ(Ljava/lang/Object;)Lg2/s;

    move-result-object v0

    invoke-static {v0, p1}, Ld4/۟۠۠۟ۢ;->ۤۧۥ(Ljava/lang/Object;I)I

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
    if-ltz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, La8/ۣۡۨ۠;->۟ۢۥۦۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gt p1, v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۥۣۤۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-gt v1, v2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    return v1

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v3

    const/16 v4, 0x68

    sget v5, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->ۣۢۡ:I

    xor-int/lit16 v5, v5, -0x208

    const/16 v6, 0x78d

    invoke-static {v3, v4, v5, v6}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v3

    const/16 v4, 0xa6

    sget v5, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۥۢۥۣ:I

    xor-int/lit16 v5, v5, -0x216

    const/16 v6, 0x83e

    invoke-static {v3, v4, v5, v6}, Lg7/۠ۤۧ;->۟ۤ۠ۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/f2;->ۣۤۨۥ()[S

    move-result-object v1

    const/16 v3, 0xaa

    sget v4, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦۢۢ:I

    xor-int/lit16 v4, v4, 0x10f

    const/16 v5, 0x266

    invoke-static {v1, v3, v4, v5}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۣۢۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/IllegalStateException;

    const/16 v3, 0x5d

    invoke-static {v0, v2, v3}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۥۦۥۨ(Ljava/lang/Object;IC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method
