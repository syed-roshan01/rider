.class public final Lr6/j;
.super Lr6/u;


# static fields
.field public static final b:Lr6/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr6/j;

    invoke-direct {v0}, Lr6/j;-><init>()V

    sput-object v0, Lr6/j;->b:Lr6/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lr6/f0;->n:Lr6/f0;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lr6/u;-><init>(Lr6/f0;Ljava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public final a()Lr6/s;
    .locals 1

    iget-object v0, p0, Lr6/u;->a:Lr6/s;

    return-object v0
.end method

.method public final b()Lr6/s;
    .locals 1

    iget-object v0, p0, Lr6/u;->a:Lr6/s;

    return-object v0
.end method
