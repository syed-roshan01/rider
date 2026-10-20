.class public final La0/d;
.super Ljava/lang/Object;

# interfaces
.implements La0/b0;
.implements La0/u;


# static fields
.field public static final a:La0/d;

.field public static final synthetic b:La0/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, La0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La0/d;->a:La0/d;

    new-instance v0, La0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La0/d;->b:La0/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public cancel()V
    .locals 0

    return-void
.end method
