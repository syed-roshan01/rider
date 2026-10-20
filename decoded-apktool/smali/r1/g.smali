.class public final Lr1/g;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Lr1/g;

.field public static final b:Lr1/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr1/g;-><init>(I)V

    sput-object v0, Lr1/g;->a:Lr1/g;

    new-instance v0, Lr1/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr1/g;-><init>(I)V

    sput-object v0, Lr1/g;->b:Lr1/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
