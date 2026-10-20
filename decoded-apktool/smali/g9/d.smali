.class public abstract Lg9/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lg9/c;

.field public static final b:Lg9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg9/c;

    invoke-direct {v0}, Lg9/d;-><init>()V

    sput-object v0, Lg9/d;->a:Lg9/c;

    sget-object v0, La9/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lg9/b;

    invoke-direct {v0}, Lg9/b;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lh9/a;

    invoke-direct {v0}, Lg9/d;-><init>()V

    :goto_1
    sput-object v0, Lg9/d;->b:Lg9/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b()I
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lg9/d;->a()I

    move-result v0

    ushr-int/lit8 v0, v0, 0x1

    rem-int/lit8 v1, v0, 0x7

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x6

    if-ltz v0, :cond_0

    const/4 v0, -0x3

    add-int/2addr v0, v1

    return v0
.end method
