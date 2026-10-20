.class public final Lr1/k;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/k1;


# static fields
.field public static final a:Lx9/v;

.field public static final b:Lx9/v;

.field public static final c:Lx9/v;

.field public static final d:Lx9/v;

.field public static final e:Lr1/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lx9/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    sput-object v0, Lr1/k;->a:Lx9/v;

    new-instance v0, Lx9/v;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    sput-object v0, Lr1/k;->b:Lx9/v;

    new-instance v0, Lx9/v;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    sput-object v0, Lr1/k;->c:Lx9/v;

    new-instance v0, Lx9/v;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    sput-object v0, Lr1/k;->d:Lx9/v;

    new-instance v0, Lr1/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr1/k;->e:Lr1/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Lr1/j1;)V
    .locals 0

    invoke-virtual {p1}, Lr1/j1;->clear()V

    return-void
.end method
