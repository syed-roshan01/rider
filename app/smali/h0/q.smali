.class public final Lh0/q;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lh0/q;

.field public static final c:Lh0/q;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh0/q;-><init>(I)V

    sput-object v0, Lh0/q;->b:Lh0/q;

    new-instance v0, Lh0/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh0/q;-><init>(I)V

    sput-object v0, Lh0/q;->c:Lh0/q;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh0/q;->a:I

    return-void
.end method
