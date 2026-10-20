.class public final Lk6/i7;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lk6/i7;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    sget v1, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥ۟ۧ:I

    xor-int/lit16 v1, v1, -0x294

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lk6/i7;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/i7;->a:Ljava/lang/String;

    iput-wide p2, p0, Lk6/i7;->b:J

    iput p4, p0, Lk6/i7;->c:I

    invoke-static {}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۧۦ۟()I

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
    const-string v0, "4JLEkOpghNnG5RoNzJyw"

    invoke-static {v0}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->۟۠ۥۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    sget v0, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->۟ۧ۟ۥۢ:I

    xor-int/lit16 v0, v0, 0x4c68

    invoke-static {v0, p1}, Lcom/google/android/gms/common/ۦۢۨ;->ۣ۟ۧۡۤ(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0}, Lz2/ۢۨۨۦ;->ۧۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۨۥ۟ۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    sget v1, Lf0/ۣۦۦ۠;->۟ۤۡۡ۟:I

    sget v2, Lm7/ۥۨۥ۟;->۠ۡۡۦ:I

    xor-int/lit16 v2, v2, 0x30e

    xor-int/lit16 v1, v1, -0x32a

    invoke-static {p1, v2, v1}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟ۤۢۦ(Ljava/lang/Object;II)V

    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۨۦ۠۠(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Landroidx/preference/۟ۤۥۦۧ;->۟ۤۤۧۨ(Ljava/lang/Object;J)V

    sget v1, Li9/ۨۨ۟;->ۣ۟۠ۡۤ:I

    sget v2, Ldagger/hilt/components/۟ۦۣۤۤ;->ۨ۟۠ۨ:I

    xor-int/lit8 v2, v2, 0x73

    xor-int/lit16 v1, v1, -0x26d

    invoke-static {p1, v2, v1}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟ۤۢۦ(Ljava/lang/Object;II)V

    invoke-static {p0}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->۟ۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۣ۟ۨ۠(Ljava/lang/Object;I)V

    invoke-static {v0, p1}, Li5/ۢۤۡ;->۟ۡ۟ۤ۟(ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۥۡۧ۠()I

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
    const-string v0, "VvMs3JPm8tVFh4jbvIg0ZA54bx"

    invoke-static {v0}, Li4/ۨ۟ۨ;->ۣۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
